package manager.CriminalCaseManager;

import manager.CriminalCaseManager.ProceduralDesicionManager.ProceduralDecision;
import manager.LawRuleManager.Article;
import manager.investigatorManager.Investigator;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class CriminalCase {
    private Investigator currentInvestigator; // текущий следователь по делу
    private ArrayList<Investigator>investigators; // следователи, которые вели расследование по делу
    private ArrayList <Article> articles; // статьи уголовного кодекса
    private ArrayList <Victim> victims; // потерпевшие по уголовному делу
    private ArrayList <Suspect> suspects; // фигуранты по уголовному делу
    private ArrayList <Expertise> expertiseArrayList; // экспертизы по уголовному делу
    private LocalDateTime proceduralTerm; // процессуальный срок по делу
    private ArrayList <ProceduralDecision> proceduralDecisions; // принятые процессуальные решения по делу;
    private String accusationPlot; // фабула уголовного дела
    private String id;
    private LocalDateTime startDate; // дата возбуждения уголовного дела
    private boolean isUnderway = false;

    public Investigator getCurrentInvestigator() {
        return currentInvestigator;
    }

    public String getNumber() {
        return id;
    }


    public void setCurrentInvestigator(Investigator currentInvestigator) {
        this.currentInvestigator = currentInvestigator;
    }

    public ArrayList<Investigator> getInvestigators() {
        return investigators;
    }

    public void addInvestigator(Investigator investigator) {

        investigators.add(investigator);
    }

    public void deleteInvestigator(Investigator investigator) {
        investigators.remove(investigator);
    }


    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }

    public ArrayList<Victim> getVictims() {
        return victims;
    }

    public void setVictims(ArrayList<Victim> victims) {
        this.victims = victims;
    }

    public ArrayList<Suspect> getSuspects() {
        return suspects;
    }

    public void setSuspects(ArrayList<Suspect> suspects) {
        this.suspects = suspects;
    }

    public ArrayList<Expertise> getExpertiseArrayList() {
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

    public ArrayList<ProceduralDecision> getProceduralDecisions() {
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
