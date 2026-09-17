package com.flm.bed.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BedAssignmentHistory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long bedAssignmentHistoryId;
	
	private long bedId;
	
	private long patientId;
	
	private LocalDateTime assignedAt;
	
	private LocalDateTime vacatedAt;

	@ManyToOne
	@JoinColumn(name = "bed_Number", nullable = false)
	private Bed bed;
	
	
}
