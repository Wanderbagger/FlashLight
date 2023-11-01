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

    @Override
    public Article recognize(String line) {
            Article article = new Article();
            if (line.charAt(11) == ' ') {
                article.setNumber(line.substring(7, 10));
                article.setDescription(cutDescription(line.substring(11)));
            } else if (Character.isDigit(line.charAt(11))) {
                article.setNumber(line.substring(7, 12));
                article.setDescription(cutDescription(line.substring(13)));
            }
            return article;
        }
    }

