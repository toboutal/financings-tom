package fr.formation.financings.dtos;

public interface FinancingViewDto {

    Long getId();

    String getReference();

    Double getAmount();

    Double getRate();

    String getClientName();

    String getClientContactFirstName();

    String getClientContactLastName();
}
