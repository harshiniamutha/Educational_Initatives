public abstract class SupportHandler {
    protected SupportHandler nextHandler;
    protected String handlerName;
    
    public SupportHandler(String handlerName) {
        this.handlerName = handlerName;
    }
    
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    
    public abstract boolean canHandle(SupportRequest request);
    
    public void handle(SupportRequest request) {
        if (canHandle(request)) {
            System.out.println(handlerName + " is handling: " + request.getDescription());
            System.out.println("Priority: " + request.getPriority() + ", Issue: " + request.getIssue());
            System.out.println("Request resolved by " + handlerName + "\n");
        } else if (nextHandler != null) {
            System.out.println(handlerName + " cannot handle this request. Passing to next handler...");
            nextHandler.handle(request);
        } else {
            System.out.println("No handler can process this request: " + request.getDescription());
            System.out.println("Request will be escalated to management.\n");
        }
    }
}
