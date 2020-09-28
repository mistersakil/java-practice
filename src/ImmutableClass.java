public final class ImmutableClass {
    final StringBuffer nid;
    ImmutableClass(StringBuffer nid){
        this.nid = nid;
    }
    public void getNid(){
        System.out.println(this.nid);
    }
    public void setNid(StringBuffer nid){
//        this.nid = nid; // doesn't work
    }
    public static void main(String[] args) {
        StringBuffer id = new StringBuffer("9845123547899545");
        ImmutableClass obj = new ImmutableClass(id);
//        obj.setNid(id);
        obj.getNid();
    }
}
