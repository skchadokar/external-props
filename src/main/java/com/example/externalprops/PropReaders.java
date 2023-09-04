package com.example.externalprops;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("file:/etc/secrets/application.properties")
@Component
@ConfigurationProperties("spring")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropReaders {

  public String name;
  public String age;
}
