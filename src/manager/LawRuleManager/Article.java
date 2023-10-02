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
}
