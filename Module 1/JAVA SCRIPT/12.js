fetch('/api/register', { method: 'POST', body: JSON.stringify(data) })  
.then(() => showSuccess()).catch(() => showError());  
setTimeout(() => { /* simulate delay */ }, 2000);
