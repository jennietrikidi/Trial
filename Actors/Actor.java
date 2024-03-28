public class Actor {
    private String name;
    private int age;
    private int acts;
    public Actor(String name,int age,int acts){
        this.name=name;
        this.age=age;
        this.acts=acts;
    }
    public Actor(){
        this.name=null;
        this.age=0;
        this.acts=0;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getActs() {
        return acts;
    }

    public void setActs(int acts) {
        this.acts = acts;
    }
    public String toString(){
        return "name: "+getName()+"\n"+"age: "+getAge()+"\n"+"acts: "+getActs();
    }
}
