package manager.lawRuleManager;

import java.util.ArrayList;
import java.util.List;

public class Article extends LawRule{

    private final List <Part> parts = new ArrayList<>();
    private Part part = new Part();

    @Override
    public String toString() {
        String article = "Статья № " + getNumber() + " (" + getDescription().trim() + ")";
        if (part.getNumber() != null){
            article += " " + part.toString();
        }
        if (!this.part.getParagraphs().isEmpty()){
            article += " " + part.getParagraphs().toString();
        }
        return article;
    }
    /*
    // Запасной метод для проверки инициализации УК
        public void printArticle(){
            System.out.println("Article{" + '\'' + "number='" + getNumber() + "'" + '\n' + "description='" + getDescription() + "'" + '\n');
            for (Part part : parts) {
                System.out.println(part);
            }
        }
    */
    public List<Part> getParts() {
        return parts;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public void setParts(Part part) {
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