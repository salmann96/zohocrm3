package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Lead;

public interface LeadService {
public void saveLead(Lead lead);

public Lead getOneLead(Long id);

public void deleteOneLead(Long id);

public List<Lead> getALLlead();
}
