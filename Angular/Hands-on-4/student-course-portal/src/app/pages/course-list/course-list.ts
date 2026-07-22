import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CourseCard } from '../../components/course-card/course-card';

@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [CommonModule, CourseCard],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList implements OnInit {

  isLoading = true;

  selectedCourseId = 0;

  courses = [
    {
      id: 1,
      name: 'Angular',
      code: 'ANG101',
      credits: 4,
      gradeStatus: 'passed'
    },
    {
      id: 2,
      name: 'Java',
      code: 'JAVA201',
      credits: 3,
      gradeStatus: 'pending'
    },
    {
      id: 3,
      name: 'Spring Boot',
      code: 'SPR301',
      credits: 4,
      gradeStatus: 'failed'
    },
    {
      id: 4,
      name: 'SQL',
      code: 'SQL101',
      credits: 3,
      gradeStatus: 'passed'
    },
    {
      id: 5,
      name: 'Git',
      code: 'GIT001',
      credits: 2,
      gradeStatus: 'pending'
    }
  ];

  ngOnInit(): void {

  console.log("ngOnInit called");

  this.isLoading = false;

}

  onEnroll(courseId: number) {

    console.log('Enrolling in course:', courseId);

    this.selectedCourseId = courseId;

  }

  // trackBy prevents Angular from recreating every card when only one item changes.
  trackByCourseId(index: number, course: any): number {

    return course.id;

  }

}