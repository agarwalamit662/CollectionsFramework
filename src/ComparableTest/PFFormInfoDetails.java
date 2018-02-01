package ComparableTest;

/**
 * Created by amitagarwal3 on 8/31/2017.
 */
public class PFFormInfoDetails implements Comparable{

    protected String parentSeqNum;

    public String getParentSeqNum() {
        return parentSeqNum;
    }

    public void setParentSeqNum(String parentSeqNum) {
        this.parentSeqNum = parentSeqNum;
    }

    public String getApplicantName() {
        return applicantName;
    }

    @Override
    public String toString() {
        return "PFFormInfoDetails{" +
                "parentSeqNum='" + parentSeqNum + '\'' +
                ", applicantName='" + applicantName + '\'' +
                '}';
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    protected String applicantName;

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        PFFormInfoDetails obj = (PFFormInfoDetails) o;

        return obj.getParentSeqNum().compareTo(this.parentSeqNum);

    }
}
