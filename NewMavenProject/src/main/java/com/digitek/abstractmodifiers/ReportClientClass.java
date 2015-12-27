package com.digitek.abstractmodifiers;

public abstract class ReportClientClass {

	public static void main(String[] args) {
		csvReportclient();
		

	}
	
	public static void csvReportclient(){
		CsvReportgenerator csvreport = new CsvReportgenerator();
		csvreport = generateheader();
		csvreport = generatesubheader();
		csvreport = generateputlogo ;
		csvreport = generatebody;
		csvreport = generatefooter;
		
	}
	private static CsvReportgenerator generatesubheader() {
		// TODO Auto-generated method stub
		return null;
	}

	private static CsvReportgenerator generateheader() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void XmlReportclient(){
		
		XmlReportgenerator xmlreport = new XmlReportgenerator;
		
		xmlreport = generateheader;
		xmlreport = generatesubheader;
		xmlreport = generatelogo;
		xmlreport = generatebody;
		xmlreport = generatefooter;
	
}
