package com.olive.gatlingdemo.util;

import java.util.Arrays;
import java.util.List;

public class Constants {

	public static final String PATH_SEPERATOR = "/";
	public static final String PATH_SEPERATOR_UNDERSCORE = "_";
	public static final String SIGNER = "/Signer/";
	public static final String INTENT = "/intent/";
	public static final String HSM = "/hsm/";
	public static final String SSL = "/ssl/";
	public static final String BANK_CERT = "./bankCert/";
	public static final String SPEC = "./Spec/";
	public static final String TEST_CASES = "./TestCases/";
	public static final String SCRIPTS_ACQ = "./scripts/acquirer";
	public static final String SCRIPTS_ISS = "./scripts/issuer";
	public static final String JS = "/js/";
	public static final String CSS = "/css/";
	public static final String FONTS = "/fonts/";
	public static final String ASSETS = "/assets/";
	public static final List<String> SCL_DEVICE_TYPES = Arrays.asList("MOB","IVR");

	private Constants() {
		super();
	}

}
