package com.Shivam.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Shivam.Entity.JournalEntry;
import com.Shivam.Repo.JournalEntryRepo;

@Service
public class JournalEntryService {

	@Autowired	
	private JournalEntryRepo journalRepo;

	
	public void saveEntry(JournalEntry Entry) {
		Entry.setDate(LocalDateTime.now());
		journalRepo.save(Entry);
	}
	
	
	public List<JournalEntry> getAll(){
		return (List<JournalEntry>) journalRepo.findAll();
	}
	
	
	 public Optional<JournalEntry> findById(Long id) {
	        return journalRepo.findById(id);
	    }
	 
	 
	 public void deleteById(long id) {
		 journalRepo.deleteById(id);
	 }
}
