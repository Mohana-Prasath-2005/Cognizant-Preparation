fetch('/api/events').then(res => res.json()).then(data => console.log(data)).catch(err => console.error(err));  
async function loadEvents() {  
  const res = await fetch('/api/events');  
  const data = await res.json();  
}
