app.service('CourseService',['$http', function ($http){
    const API_URL='http://localhost:8080/courses';
    this.getCourses=function (){
        return $http.get(API_URL);
    };
    this.addCourse=function (course){
        return $http.post(API_URL, course);
    };
}]);