package com.kpaas.nameservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "name_data")
@Getter
@Setter
@NoArgsConstructor
public class NameEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long no;

    public String data1;
    public String data2;
}
