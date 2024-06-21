package day12.step1;

public class VIPCustomer extends Customer {
    double saleRatio;
    private int agentID;

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int getAgentID() {
        return agentID;
    }
}
