package com.tp.domain.incident;

import java.util.List;

public interface IncidentDAO {
  Incident findById(Long id);

  List<Incident> findAll();

  void save(Long id, Incident data);

  void update(Incident data);

  void delete(Long id);
}
