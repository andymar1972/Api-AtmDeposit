package com.everis.external;

import com.everis.response.AccountResponseAtm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class FingerPrintResponse {
  
  private String entityName;
  private boolean succes;

}
