package manager.LawRuleManager;

import java.util.ArrayList;

public class Article extends LawRule{

    protected ArrayList <Part> parts = new ArrayList<>();

    @Override
    public String toString() {
        printArticle();
        return "";
    }

    public void printArticle(){
        System.out.println("Article{" + '\'' + "number='" + getNumber() + "'" + '\n' + "description='" + getDescription() + "'" + '\n');
        for (Part part : parts) {
            System.out.println(part);
        }
    }

    public ArrayList<Part> getParts() {
        return parts;
    }

    public Part getPart(String number){
        for (Part part : parts) {
            if(part.getNumber().equals(number)){
                return part;
            }
        }
        return null;
    }

    public void setParts(Part part) {
        this.parts.clear();
        this.parts.add(part);
    }

}
