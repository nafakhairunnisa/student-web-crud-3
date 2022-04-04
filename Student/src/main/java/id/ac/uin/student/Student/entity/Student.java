package id.ac.uin.student.Student.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Column(nullable = false, name = "first_name")
    private String firstName;

    @NotEmpty
    @Column(nullable = false, name = "last_name")
    private String lastName;

    @NotEmpty
    @Column(nullable = false, name = "email", unique = true)
    private String email;

    @NotEmpty
    @Column(nullable = false, name = "phone_number", unique = true)
    private String phoneNumber;

    @NotEmpty
    @Column(nullable = false, name = "jurusan", unique = true)
    private String jurusan;
}
