package vn.edu.vnua.dse.stcalendar.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "calendar")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Calendar {
	// fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "student_id")
	private String StudentId;

	@Column(name = "calendar_id")
	private String calendar_id;

	@Column(name = "type")
	private int type;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "updated_at")
	private Date updatedAt;

	// referents
	@ManyToOne
	@JoinColumn(name = "user_id") // thông qua khóa ngoại user_id
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private User user;

	@OneToMany(mappedBy = "calendar", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude 
    private Collection<Event> events;
	
	@OneToMany(mappedBy = "calendar", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude 
    private Collection<CalendarDetail> calendarDetails;
	// functions
}
