package com.Shivam.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Shivam.Entity.JournalEntry;
import com.Shivam.Service.JournalEntryService;

@RestController
@RequestMapping("/journal")
public class JournalController {

	@Autowired
	private JournalEntryService journalService;

	@GetMapping
	public List<JournalEntry> getAll() {
		return journalService.getAll();
	}

	@PostMapping
	public boolean createEntry(@RequestBody JournalEntry myentry) {
		journalService.saveEntry(myentry);
		return true;
	}

	@GetMapping("id/{myid}")
	public Optional<JournalEntry> getEntrybyid(@PathVariable Long myid) {
		return Optional.ofNullable(journalService.findById(myid).orElseGet(null));

	}

	@DeleteMapping("id/{id}")
	public void deleteEntry(@PathVariable Long id) {
		journalService.deleteById(id);
		System.out.println("Deleted Successfully");
	}

	@PutMapping("id/{id}")
	public JournalEntry updateEntry(@PathVariable Long id, @RequestBody JournalEntry entry) {

		JournalEntry oldEntry = journalService.findById(id).orElse(null);

		if (entry != null) {
			oldEntry.setTital(entry.getTital() != null && !oldEntry.getTital().equals("") ? entry.getTital()
					: oldEntry.getTital());
			oldEntry.setContent(entry.getContent() != null && !oldEntry.getContent().equals("") ? entry.getContent()
					: oldEntry.getContent());
		}
		journalService.saveEntry(oldEntry);
		return oldEntry;
	}
}
