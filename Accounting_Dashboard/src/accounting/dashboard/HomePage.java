package accounting.dashboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.SessionFactory;

import builder.classes.CreditorDashBoard;
import builder.classes.DashBoardBuilder;
import builder.classes.DebtorDashBoard;

import com.opensymphony.xwork2.ActionSupport;

public class HomePage  extends ActionSupport  {
	
  private CreditorDashBoard cb = new CreditorDashBoard();
  private DebtorDashBoard db = new DebtorDashBoard();

	public String homePage() {
		DashBoardBuilder dbuilder = new DashBoardBuilder();
		setCb((dbuilder.buildCreditorDashBoard()));
		return "HomePage";
	}
	
	public String debtorHomepage() {
		DashBoardBuilder dbuilder = new DashBoardBuilder();
		setDb((dbuilder.buildDebtorDashBoard()));
		return "debtorDashBoardBody";
	}
	
	public String posReport() {
		return "pos_report";
	}

	public String codReport() {
		return "cod_report";
	}

	public String fsdPaymentReportpage() {
		return "fsdPaymentReportpage";
	}

	public CreditorDashBoard getCb() {
		return cb;
	}

	public void setCb(CreditorDashBoard cb) {
		this.cb = cb;
	}

	public DebtorDashBoard getDb() {
		return db;
	}

	public void setDb(DebtorDashBoard db) {
		this.db = db;
	}
	
	
}
