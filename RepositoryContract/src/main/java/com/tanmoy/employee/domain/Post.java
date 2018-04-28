package com.tanmoy.employee.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonManagedReference;


//https://www.callicoder.com/hibernate-spring-boot-jpa-one-to-many-mapping-example/
@Entity
@Table(name = "posts")
public class Post {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NotNull
	    @Size(max = 100)
	    @Column(unique = true)
	    private String title;

	    @NotNull
	    @Size(max = 250)
	    private String description;

	    @NotNull
	    @Lob
	    private String content;

	    @NotNull
	    @Temporal(TemporalType.TIMESTAMP)
	    @Column(name = "posted_at")
	    private Date postedAt = new Date();

	    @NotNull
	    @Temporal(TemporalType.TIMESTAMP)
	    @Column(name = "last_updated_at")
	    private Date lastUpdatedAt = new Date();

	    @OneToMany(cascade = CascadeType.ALL,
	            fetch = FetchType.LAZY,
	            mappedBy = "post")
	    @JsonManagedReference
	    private Set<Comment> comments = new HashSet<>();

	    public Post() {

	    }

	    public Post(String title, String description, String content) {
	        this.title = title;
	        this.description = description;
	        this.content = content;
	    }

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Date getPostedAt() {
			return postedAt;
		}

		public void setPostedAt(Date postedAt) {
			this.postedAt = postedAt;
		}

		public Date getLastUpdatedAt() {
			return lastUpdatedAt;
		}

		public void setLastUpdatedAt(Date lastUpdatedAt) {
			this.lastUpdatedAt = lastUpdatedAt;
		}

		public Set<Comment> getComments() {
			return comments;
		}

		public void setComments(Set<Comment> comments) {
			this.comments = comments;
		}
}