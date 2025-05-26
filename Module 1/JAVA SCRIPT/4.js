function addEvent(event) { /* ... */ }  
function registerUser(eventId) { /* ... */ }  
function filterEventsByCategory(cat) { /* ... */ }  
function categoryTracker() {  
  let total = 0;  
  return () => total++;  
}
