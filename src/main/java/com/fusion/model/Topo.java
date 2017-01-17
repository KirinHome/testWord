package com.fusion.model;

import com.google.common.collect.Maps;
import org.apache.log4j.Logger;

import java.io.Serializable;
import java.util.*;


public class Topo implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Logger LOG = Logger.getLogger(Topo.class);


	/** 描述 */
	private String description;

	/** topo类型 */
	private int topoType;

	private String id;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getTopoType() {
		return topoType;
	}

	public void setTopoType(int topoType) {
		this.topoType = topoType;
	}
}
