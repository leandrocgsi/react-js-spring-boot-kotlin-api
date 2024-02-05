package br.com.erudio.data.vo.v1

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonInclude.Include
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.github.dozermapper.core.Mapping
import org.springframework.hateoas.RepresentationModel
import org.springframework.hateoas.server.core.Relation


@JsonInclude(Include.NON_NULL)
@Relation(collectionRelation = "personVOes", itemRelation = "person")
@JsonPropertyOrder("id", "firstName", "lastName", "address", "gender", "enabled")
data class PersonVO (

    @Mapping("id")
    @field:JsonProperty("id")
    var key: Long = 0,
    var firstName: String = "",
    var lastName: String = "",
    var address: String = "",
    var gender: String = "",
    var enabled: Boolean = true
) : RepresentationModel<PersonVO>()