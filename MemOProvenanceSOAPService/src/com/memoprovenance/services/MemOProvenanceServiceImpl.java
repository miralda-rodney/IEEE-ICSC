package com.memoprovenance.services;

import java.util.*;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class MemOProvenanceServiceImpl {

	private static List<Provenance> provenanceCatalog;
	
	public MemOProvenanceServiceImpl() {
		initializeProvenanceCatalog();
	}
	
	@WebMethod
	public Provenance[] getAllProvenance() {
		Provenance[] provenances = new Provenance[provenanceCatalog.size()];
		int i = 0;
		
		for(Provenance p : provenanceCatalog) {
			provenances[i] = p;
			i++;
		}
		
		return provenances;
	}
	
	@WebMethod
	public void insertProvenance(@WebParam(name = "provenance" ) Provenance provenance) {
		provenanceCatalog.add(provenance);
	}
	
	private void initializeProvenanceCatalog() {
		if(provenanceCatalog == null) {
			provenanceCatalog = new ArrayList<>();
			provenanceCatalog.add(new Provenance("Name", "Organization", new Date(), "Action"));
		}
	}
}
