SELECT organizer_id, status, COUNT(event_id) AS event_count
FROM Events
GROUP BY organizer_id, status;
