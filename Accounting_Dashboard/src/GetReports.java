import java.io.BufferedReader;
import java.io.File.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.activation.MimetypesFileTypeMap;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class GetReports extends ActionSupport{

	private InputStream fileInputStream;
	 
	private String reportName = "";
	
	private String fromDate = "";
	
	private String toDate = "";
	
	public InputStream getFileInputStream() {
		return fileInputStream;
	}

	public String getReport() throws Exception {
		String file_path= "";
		if(!reportName.equalsIgnoreCase("")){
			String[] command = { "/Users/punith.n/sh.sh", reportName };
			file_path = executeScript(command);
		}
	    fileInputStream = new FileInputStream(new File(file_path));
	    return "success";
	}

	private String executeScript(String[] shellScript) {
		// TODO Auto-generated method stub
		 try {
		        Process p = Runtime.getRuntime().exec(shellScript);
		        // you can pass the system command or a script to exec command. here i used uname -a system command
		        BufferedReader stdInput = new BufferedReader(new 
		                InputStreamReader(p.getInputStream()));

		        BufferedReader stdError = new BufferedReader(new 
		                InputStreamReader(p.getErrorStream()));

		        // read the output from the command
		        String s="";
		        
		        while ((s = stdInput.readLine()) != null) {
		            System.out.println("Std OUT: "+s);
		            return s ;
		        }
		        
		        while ((s = stdError.readLine()) != null) {
		            System.out.println("Std ERROR : "+s);
		            return s ;
		        }
		         
		       
		        
		    } catch (IOException e) {
		      
		        e.printStackTrace();
		    }
		return null;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public void setFileInputStream(InputStream fileInputStream) {
		this.fileInputStream = fileInputStream;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	
	
}
