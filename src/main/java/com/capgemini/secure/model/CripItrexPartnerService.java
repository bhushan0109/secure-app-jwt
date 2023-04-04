package com.capgemini.secure.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "crip_itrex_partner_service")
public class CripItrexPartnerService implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cips_id")
	private Long cips_id;

	@Column(name = "cips_trid_no")
	private String cips_trid_no;

	@Column(name = "cips_ic_cd")
	private String cips_ic_cd;

	@Column(name = "cips_req_file_path_zip")
	private String cips_req_file_path_zip;

	@Type(type = "com.capgemini.secure.model.SQLXMLType")
	@Column(name = "cips_req_xml_file", columnDefinition = "xml")
	private String cips_req_xml_file;

	@Type(type = "com.capgemini.secure.model.SQLXMLType")
	@Column(name = "cips_err_res_xml_file", columnDefinition = "xml")
	private String cips_err_res_xml_file;

	@Lob
	@Column(name = "cips_err_res_xml_contents")
	private String cips_err_res_xml_contents;

	@Column(name = "cips_ndml_eia_number")
	private String cips_ndml_eia_number;

	@Column(name = "cips_itrex_eia_number")
	private String cips_itrex_eia_number;
	@Column(name = "cips_eia_status")
	private String cips_eia_status;

	@Column(name = "cips_crt_by")
	private String cips_crt_by;

	@Column(name = "cips_crt_dt")
	private Date cips_crt_dt;

	@Column(name = "cips_update_dt")
	private Date cips_update_dt;

	@Column(name = "cips_dedup_flg")
	private String cips_dedup_flg;

}
