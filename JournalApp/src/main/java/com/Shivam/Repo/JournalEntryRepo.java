package com.Shivam.Repo;

import org.springframework.data.repository.CrudRepository;

import com.Shivam.Entity.JournalEntry;

public interface JournalEntryRepo extends CrudRepository<JournalEntry, Long>{

}
