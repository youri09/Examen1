package edu.ap.registraties;

import java.util.Date;

public class Registratie {
	
	 public Date interventie;
	 public String naamP;
	 public Date geboortedaatum;
	 public String naamV;
	 public String diagnose;
	public Date getInterventie() {
		return interventie;
	}
	public void setInterventie(Date interventie) {
		this.interventie = interventie;
	}
	public String getNaamP() {
		return naamP;
	}
	public void setNaamP(String naamP) {
		this.naamP = naamP;
	}
	public Date getGeboortedaatum() {
		return geboortedaatum;
	}
	public void setGeboortedaatum(Date geboortedaatum) {
		this.geboortedaatum = geboortedaatum;
	}
	public String getNaamV() {
		return naamV;
	}
	public void setNaamV(String naamV) {
		this.naamV = naamV;
	}
	public String getDiagnose() {
		return diagnose;
	}
	public void setDiagnose(String diagnose) {
		this.diagnose = diagnose;
	}
	 
	 

}
