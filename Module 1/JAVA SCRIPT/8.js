button.onclick = () => registerUser(eventId);  
select.onchange = () => filterEvents(cat);  
input.onkeydown = e => { if (e.key === "Enter") searchEvent(); }
