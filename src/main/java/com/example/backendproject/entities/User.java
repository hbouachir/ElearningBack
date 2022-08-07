package com.example.backendproject.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long user_id;
	private String firstname;
	private String lastname;
	@Column(unique = true)
	private String username;
	@Column(unique = true)
	private String email;
	private Date datenaissance;
	private Long phone;
	private String sexe;
	private String profession;
	private String password;
	private String confirmepassword;
	private Boolean isblocked;
	private Boolean enabled=false;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<Role> roles;


	@OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
	private Set<Exercice> exercices;
}
