# Checklist dei Metodi di `LedgerEntryPage`

Spunta ogni metodo man mano che viene testato o documentato.

- [X] `LedgerEntryPage(int pageSize, int entriesPerPage)`
- [X] `LedgerEntryPage(int pageSize, int entriesPerPage, LEPStateChangeCallback callback)`
- [ ] `resetPage()`
- [ ] `markDeleted()`
- [ ] `isDeleted()`
- [ ] `toString()`
- [X] `usePage()`
- [ ] `releasePageNoCallback()`
- [ ] `releasePage()`
- [ ] `releasePageInternal(boolean shouldCallback)`
- [X] `checkPage()` INDIRECTLY
- [ ] `equals(Object other)`
- [ ] `hashCode()`
- [ ] `setClean(int versionOfCleaning)`
- [ ] `isClean()`
- [ ] `setOffset(long offset, int position)`
- [ ] `getOffset(int position)`
- [ ] `zeroPage()`
- [ ] `readPage(FileInfo fi)`
- [ ] `getPageToWrite()`
- [ ] `getLedger()`
- [ ] `getVersion()`
- [ ] `getEntryKey()`
- [ ] `setLedgerAndFirstEntry(long ledgerId, long firstEntry)`
- [ ] `getFirstEntry()`
- [ ] `getMaxPossibleEntry()`
- [ ] `getFirstEntryPosition()`
- [X] `inUse()` INDIRCTLY
- [ ] `getLastEntryIndex()`
- [ ] `getLastEntry()`
- [ ] `getEntries(EntryVisitor vis)`
- [ ] `getEntriesIterator()`
- [ ] `close()`

---

**Nota:**  
Ricordati di includere anche i metodi privati se vuoi una copertura completa tramite test indiretti.