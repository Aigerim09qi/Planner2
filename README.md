CampusLife Planner 2.0 is a Java console application that manages different types of student activities using Inheritance and Polymorphism.
The project includes:
ScheduleItem (abstract superclass)
CourseworkTask
ExamStudySession
ExtracurricularActivity
StudentPlannerApp (main class)
All activity types inherit common fields:
title
days remaining
estimated hours
completion status
Each subclass overrides methods to calculate priority and display information differently.
Features
Stores different activity types in one List<ScheduleItem>
Demonstrates runtime polymorphism
Marks items as completed
Calculates total remaining time
Finds the most urgent activity
