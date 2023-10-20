package manager.CriminalCaseManager;

import manager.CriminalCaseManager.ProceduralDesicionManager.ProceduralDecision;
import manager.LawRuleManager.Article;
import manager.investigatorManager.Investigator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CriminalCase {
    private Investigator currentInvestigator; // текущий следователь по делу
    private List<Investigator> investigators = new ArrayList<>(); // следователи, которые вели расследование по делу
    private List <Article> articles = new ArrayList<>(); // статьи уголовного кодекса
    private List <Victim> victims = new ArrayList<>(); // потерпевшие по уголовному делу
    private List <Suspect> suspects= new ArrayList<>(); // фигуранты по уголовному делу
    private List <Expertise> expertiseArrayList = new ArrayList<>(); // экспертизы по уголовному делу
    private LocalDateTime proceduralTerm; // процессуальный срок по делу
    private List <ProceduralDecision> proceduralDecisions = new ArrayList<>(); // принятые процессуальные решения по делу;
    private String accusationPlot; // фабула уголовного дела
    private String id;
    private LocalDateTime startDate; // дата возбуждения уголовного дела
    private boolean isUnderway = false; // ведется расследование

    public CriminalCase(Investigator currentInvestigator,
                        LocalDateTime proceduralTerm,
                        String accusationPlot,
                        String id,
                        ArrayList <Article> articles,
                        Victim victim,
                        Suspect suspect,
                        LocalDateTime startDate,
                        boolean isUnderway) {
        this.investigators.add(currentInvestigator);
        this.victims.add(victim);
        this.suspects.add(suspect);
        this.articles = articles;
        this.currentInvestigator = currentInvestigator;
        this.proceduralTerm = startDate.plusMonths(2);
        this.accusationPlot = accusationPlot;
        this.id = id;
        this.startDate = startDate;
        this.isUnderway = isUnderway;
    }

    public Investigator getCurrentInvestigator() {
        return currentInvestigator;
    }

    public String getNumber() {
        return id;
    }


    public void setCurrentInvestigator(Investigator currentInvestigator) {
        this.currentInvestigator = currentInvestigator;
    }

    public List<Investigator> getInvestigators() {
        return investigators;
    }

    public void addInvestigator(Investigator investigator) {

        investigators.add(investigator);
    }

    public void deleteInvestigator(Investigator investigator) {
        investigators.remove(investigator);
    }


    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }

    public List<Victim> getVictims() {
        return victims;
    }

    public void setVictims(List<Victim> victims) {
        this.victims = victims;
    }

    public List<Suspect> getSuspects() {
        return suspects;
    }

    public void setSuspects(List<Suspect> suspects) {
        this.suspects = suspects;
    }

    public List<Expertise> getExpertiseArrayList() {
        return expertiseArrayList;
    }

    public void setExpertiseArrayList(ArrayList<Expertise> expertiseArrayList) {
        this.expertiseArrayList = expertiseArrayList;
    }

    public LocalDateTime getProceduralTerm() {
        return proceduralTerm;
    }

    public void setProceduralTerm(LocalDateTime proceduralTerm) {
        this.proceduralTerm = proceduralTerm;
    }

    public List<ProceduralDecision> getProceduralDecisions() {
        return proceduralDecisions;
    }

    public void setProceduralDecisions(ArrayList<ProceduralDecision> proceduralDecisions) {
        this.proceduralDecisions = proceduralDecisions;
    }

    public String getAccusationPlot() {
        return accusationPlot;
    }

    public void setAccusationPlot(String accusationPlot) {
        this.accusationPlot = accusationPlot;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public boolean isUnderway() {
        return isUnderway;
    }

    public void setUnderway(boolean underway) {
        isUnderway = underway;
    }
}
