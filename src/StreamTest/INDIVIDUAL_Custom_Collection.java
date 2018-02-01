package StreamTest;


/**
* This class acts as a wrapper for one or many cargos
*@author Architecture Team
*@Creation Date WED Nov 30
*Modified By:
*Modified on:
*PCR#
*/
public class INDIVIDUAL_Custom_Collection extends AbstractCollection  {

private static final String PACKAGE =
"gov.selfservice.business.entities.APP_INDV";

public INDIVIDUAL_Custom_Collection(){}

public void addCargo(INDIVIDUAL_Custom_Cargo newCargo) {
		add(newCargo); 
}
/**
*Returns the package name.
*@return gov.selfservice.business.customEntities.INDIVIDUAL_Custom_Collection
*/
@Override
public String getPACKAGE() {
  return PACKAGE;
}

/**
*Returns cargo.
*@return java.lang.String
*/
public INDIVIDUAL_Custom_Cargo getCargo() {
  if (size() == 0){
    add(new INDIVIDUAL_Custom_Cargo());}
  return (INDIVIDUAL_Custom_Cargo) get(0);
}

/**
*Sets cargo values.
*@param newCargo The newCargo to set
*/

public void setCargo(INDIVIDUAL_Custom_Cargo newCargo) {
  if (size() == 0){
    add(newCargo);}
  else{
    set(0, newCargo);}
}

/**
*Returns an abstract cargo.
*@return gov.selfservice.business.entities.AbstractCargo
*/
public AbstractCargo getAbstractCargo() {
  return getCargo();
}

/**
*Sets abstract cargo.
*@param cargo The Cargo to set
*/

public void setAbstractCargo(AbstractCargo cargo) {
  setCargo((INDIVIDUAL_Custom_Cargo) cargo);
}

/**
*Sets cargo array into collection.
*@param cbArray The cbArray to set
*/

public void setResults(INDIVIDUAL_Custom_Cargo[]cbArray) {
  clear();
  for (int i = 0; i < cbArray.length; i++) {
    add(cbArray[i]);
}
}

/**
*Sets a cargo into particular index of the collection
*@param cb The cbarray to set
*@param idx The idx to set
*/

public void setResults(int idx, INDIVIDUAL_Custom_Cargo cb) {
  set(idx, cb);
}



@Override
public void setGenericResults(Object obj) {
  if (obj instanceof INDIVIDUAL_Custom_Cargo[]){
	INDIVIDUAL_Custom_Cargo[] cbArray = (INDIVIDUAL_Custom_Cargo[]) obj;
   for (int i = 0; i < cbArray.length; i++) {
     add(cbArray[i]);
    }
  }
}

/**
*Returns cargo array.
*@return gov.selfservice.business.entities.APP_INDV_Collection[]
*/
public INDIVIDUAL_Custom_Cargo[] getResults() {
	INDIVIDUAL_Custom_Cargo[] cbArray = new INDIVIDUAL_Custom_Cargo[size()];
  toArray(cbArray);
  return cbArray;
}

/**
*Returns a particular cargo.
*@return gov.selfservice.business.entities.APP_INDV_Collection
*/
public INDIVIDUAL_Custom_Cargo getResult(int idx) {
  return (INDIVIDUAL_Custom_Cargo) get(idx);
}

/**
*Returns size of a collection.
*@return int
*/
public int getResultsSize() {
  return size();
}
/** This one for clone Results */
public INDIVIDUAL_Custom_Cargo[] cloneResults(){
	INDIVIDUAL_Custom_Cargo[] rescargo = new INDIVIDUAL_Custom_Cargo[size()];
	for(int i=0; i<size(); i++){
		INDIVIDUAL_Custom_Cargo cargo = getResult(i);
		rescargo[i] = new INDIVIDUAL_Custom_Cargo();
		rescargo[i].setIndv_seq_num(cargo.getIndv_seq_num());
		rescargo[i].setIndv_pin_num(cargo.getIndv_pin_num());
		rescargo[i].setBrth_dt(cargo.getBrth_dt());
		rescargo[i].setFst_nam(cargo.getFst_nam());
		rescargo[i].setLast_nam(cargo.getLast_nam());
		rescargo[i].setMid_init(cargo.getMid_init());
		rescargo[i].setRlvn_ind(cargo.getRlvn_ind());
		rescargo[i].setSex_ind(cargo.getSex_ind());
		rescargo[i].setRlt_cd(cargo.getRlt_cd());
		rescargo[i].setHealth_cov_resp(cargo.getHealth_cov_resp());
	}
	return rescargo;
}

}
