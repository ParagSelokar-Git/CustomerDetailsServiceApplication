package com.confonet.entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "crz_agenda_details", schema = "master")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CrzAgendaDetailsDto implements Serializable {
	private static final long serialVersionUID = 121L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer agenda_id;
	
	@Column(name = "agenda_name")
	private String agenda_name;

	@Column(nullable = true)
	private String title_of_meeting;

	@Column(nullable = true)
	private String meeting_mode;

	@Column(nullable = true)
	private String meeting_link;

	@Column(nullable = true)
	private String meeting_venue;

	@Column(nullable = true)
	private Date agenda_creation_date;

	@Column(nullable = true)
	private Date meeting_start_date;

	@Column(nullable = true)
	private Date meeting_end_date;

	@Column(nullable = true)
	private String meeting_day_wise_details;

	// TODO
	@Column(nullable = true)
	private Integer agenda_history_id;

	// State : DRAFT/ACCEPTED/PENDING
	@Column(nullable = true)
	private String status;

	@Column(name = "created_By")
	private Integer created_by;

	@Column(name = "created_On")
	private Date created_on;

	@Column(name = "updated_By")
	private Integer updated_by;

	@Column(name = "updated_On")
	private Date updated_on;

	@Column(name = "remarks")
	private String remarks;
}
