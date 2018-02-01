package StreamTest;



/**
* This java bean contains the entities for the given table
*@author Architecture Team
*@Creation Date WED Nov 30
* Modified by:zrhoads
* Modified on: Oct 04,2007
* PCR# 32248
*Modified By:
*Modified on:
*PCR#
*/
public class INDIVIDUAL_Custom_Cargo extends AbstractCargo implements java.io.Serializable
{
	private String indv_seq_num;
	private String indv_pin_num;
	private String brth_dt;
	private String fst_nam;
	private String last_nam;
	private String mid_init;
	private String rlvn_ind;
	private String sex_ind;
	private String rlt_cd;
	private String live_arng_typ;
	private String dabl_resp;
	private String preg_resp;
	private String relation_resp;
	private String chld_trb_mbr_resp;
	private String trb_mbr_resp;
	private String startDate;
	private String hlth_plan_resp;
	private String health_cov_resp;
	//private String cov_start_dt;
	private String med_srvc_dt;
	private String child_support_ind;
	private String cooperate_ind;

	public String getMed_srvc_dt() {
		return med_srvc_dt;
	}

	public void setMed_srvc_dt(String med_srvc_dt) {
		this.med_srvc_dt = med_srvc_dt;
	}
	
/*	public String getCov_start_dt() {
		return cov_start_dt;
	}

	public void setCov_start_dt(String cov_start_dt) {
		this.cov_start_dt = cov_start_dt;
	}*/
	private static final String PACKAGE =
	"gov.selfservice.business.entities.INDIVIDUAL_Custom_Cargo";
	
	/**
	*Returns the package name.
	*@return gov.selfservice.business.entities.APP_INDV_Cargo
	*/
	public String getPackage() {
	  return PACKAGE;
	}

	/**
	*Returns the primary key values of a cargo
	*@return java.lang.String
	*/

	@Override
	public IPrimaryKey getPrimaryKey(){
		return null;
	}
	
	/**
	*Inspects Cargo values for debug.
	*@return java.lang.String
	*/
	@Override
	public String inspectCargo(){
//		StringBuffer sbf = new StringBuffer();
		return "indv_seq_num=" + indv_seq_num + "," + "indv_pin_num=" + indv_pin_num + "," + "brth_dt=" + brth_dt + "," + "fst_nam=" + fst_nam + "," + "last_nam=" + last_nam + "," + "mid_init=" + mid_init + "," + "rlvn_ind=" + rlvn_ind + "," + "sex_ind=" + sex_ind + "," + "rlt_cd=" + rlt_cd + ","+ "live_arng_typ=" + live_arng_typ+ "," + "dabl_resp=" + dabl_resp+ "," + "preg_resp=" + preg_resp+",chld_trb_mbr_resp="+chld_trb_mbr_resp+",trb_mbr_resp"+trb_mbr_resp;

	}
 
	/**
	  * Enter the description of the method
	  * Creation Date: 
	  */
	public static String getPACKAGE() {
		return PACKAGE;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	/**
	  * Enter the description of the method
	  * Creation Date: 
	  */
	public String getFst_nam() {
		return fst_nam;
	}

	/**
	  * Enter the description of the method
	  * Creation Date: 
	  */
	public String getIndv_seq_num() {
		return indv_seq_num;
	}

	/**
	  * Enter the description of the method
	  * Creation Date: 
	  */
	public String getLast_nam() {
		return last_nam;
	}

	/**
	  * Enter the description of the method
	  * Creation Date: 
	  */
	public String getMid_init() {
		return mid_init;
	}


	/**
	  * Enter the description of the method
	  * Creation Date: 
	  */
	public String getRlvn_ind() {
		return rlvn_ind;
	}

	/**
	  * Enter the description of the method
	  * Creation Date: 
	  */
	public String getSex_ind() {
		return sex_ind;
	}

	/**
	  * Enter the description of the method
	  * Creation Date: 
	  */
	public void setFst_nam(String string) {
		fst_nam = string;
	}

	/**
	  * Enter the description of the method
	  * Creation Date: 
	  */
	public void setIndv_seq_num(String string) {
		indv_seq_num = string;
	}

	/**
	  * Enter the description of the method
	  * Creation Date: 
	  */
	public void setLast_nam(String string) {
		last_nam = string;
	}

	/**
	  * Enter the description of the method
	  * Creation Date: 
	  */
	public void setMid_init(String string) {
		mid_init = string;
	}

	/**
	  * Enter the description of the method
	  * Creation Date: 
	  */
	public void setRlvn_ind(String string) {
		rlvn_ind = string;
	}

	/**
	  * Enter the description of the method
	  * Creation Date: 
	  */
	public void setSex_ind(String string) {
		sex_ind = string;
	}

	/**
	  * Enter the description of the method
	  * Creation Date: 
	  */
	public String getRlt_cd() {
		return rlt_cd;
	}

	/**
	  * Enter the description of the method
	  * Creation Date: 
	  */
	public void setRlt_cd(String string) {
		rlt_cd = string;
	}
	
	/**
	  * Enter the description of the method
	  * Creation Date: 
	  */
	public String getBrth_dt() {
		return brth_dt;
	}

	/**
	  * Enter the description of the method
	  * Creation Date: 
	  */
	public void setBrth_dt(String string) {
		brth_dt = string;
	}

	/**
	  * Enter the description of the method
	  * Creation Date: 
	  */

	/**
	  * Enter the description of the method
	  * Creation Date: 
	  */

	/**
	  * Enter the description of the method
	  * Creation Date: 
	  */
	public String getIndv_pin_num() {
		return indv_pin_num;
	}

	/**
	  * Enter the description of the method
	  * Creation Date: 
	  */
	public void setIndv_pin_num(String string) {
		indv_pin_num = string;
	}

    /**
     * @return Returns the live_arng_typ.
     */
    public String getLive_arng_typ() {
        return live_arng_typ;
    }
    /**
     * @param live_arng_typ The live_arng_typ to set.
     */
    public void setLive_arng_typ(String live_arng_typ) {
        this.live_arng_typ = live_arng_typ;
    }
   
	/**
	 * @return Returns the dabl_resp.
	 */
	public String getDabl_resp() {
		return dabl_resp;
	}
	/**
	 * @param dabl_resp The dabl_resp to set.
	 */
	public void setDabl_resp(String dabl_resp) {
		this.dabl_resp = dabl_resp;
	}
	/**
	 * @return Returns the preg_resp.
	 */
	public String getPreg_resp() {
		return preg_resp;
	}
	/**
	 * @param preg_resp The preg_resp to set.
	 */
	public void setPreg_resp(String preg_resp) {
		this.preg_resp = preg_resp;
	}
	/**
	 * @return Returns the relation_resp.
	 */
	public String getRelation_resp() {
		return relation_resp;
	}
	/**
	 * @param relation_resp The relation_resp to set.
	 */
	public void setRelation_resp(String relation_resp) {
		this.relation_resp = relation_resp;
	}
	/**
	 * @return Returns the chld_trb_mbr_resp.
	 */
	public String getChld_trb_mbr_resp() {
		return chld_trb_mbr_resp;
	}
	/**
	 * @param chld_trb_mbr_resp The chld_trb_mbr_resp to set.
	 */
	public void setChld_trb_mbr_resp(String chld_trb_mbr_resp) {
		this.chld_trb_mbr_resp = chld_trb_mbr_resp;
	}
	/**
	 * @return Returns the trb_mbr_resp.
	 */
	public String getTrb_mbr_resp() {
		return trb_mbr_resp;
	}
	/**
	 * @param trb_mbr_resp The trb_mbr_resp to set.
	 */
	public void setTrb_mbr_resp(String trb_mbr_resp) {
		this.trb_mbr_resp = trb_mbr_resp;
	}

	/**
	 * @return the hlth_plan_resp
	 */
	public String getHlth_plan_resp() {
		return hlth_plan_resp;
	}

	/**
	 * @param hlth_plan_resp the hlth_plan_resp to set
	 */
	public void setHlth_plan_resp(String hlth_plan_resp) {
		this.hlth_plan_resp = hlth_plan_resp;
	}
	
	/**
	 * @return the health_cov_resp
	 */
	public String getHealth_cov_resp() {
		return health_cov_resp;
	}

	/**
	 * @param health_cov_resp to set
	 */
	public void setHealth_cov_resp(String health_cov_resp) {
		this.health_cov_resp = health_cov_resp;
	}

	/**
	 * @return the child_support_ind
	 */
	public String getChild_support_ind() {
		return child_support_ind;
	}

	/**
	 * @param child_support_ind the child_support_ind to set
	 */
	public void setChild_support_ind(String child_support_ind) {
		this.child_support_ind = child_support_ind;
	}

	/**
	 * @return the cooperate_ind
	 */
	public String getCooperate_ind() {
		return cooperate_ind;
	}

	/**
	 * @param cooperate_ind the cooperate_ind to set
	 */
	public void setCooperate_ind(String cooperate_ind) {
		this.cooperate_ind = cooperate_ind;
	}


}