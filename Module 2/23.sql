SELECT DATE_FORMAT(registration_date, '%Y-%m') AS reg_month, COUNT(*) AS reg_count
FROM Registrations
WHERE registration_date >= CURRENT_DATE - INTERVAL 12 MONTH
GROUP BY reg_month
ORDER BY reg_month;
