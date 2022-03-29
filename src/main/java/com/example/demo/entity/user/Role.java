package com.example.demo.entity.user;



import java.util.Set;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;





@Entity
@Table(name = "role")
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    
    @OneToMany(mappedBy="role")
    private Set<User> users;
    

    public Role(String name) {
        super();

        this.name = name;
    }
    public Role() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
	public String substring(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}


}
