package fatimska.rosary.planner.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="NOTES")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="NOTES_ID")
    private Long id;

    @Column(name="TITLE")
    private String title;

    @Lob
    @Column(name="ARTICLE")
    private String article;

    @Column(name="CREA_DATE")
    private Date date;
}
