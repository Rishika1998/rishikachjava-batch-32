package week1;
//assi 3 quest 1 implementing parent 1 and parent 2 class
public class ParentChild implements Parent1,Parent2{
    String name;

    @Override
    public String getmothername(){
        
        return name;
    }

    public void setName() {

        setName(null);
    }

    public void setName(String name){
        
        this.name=name;
    }

    @Override
    public String getfathername() {

        return null;
    }
}
