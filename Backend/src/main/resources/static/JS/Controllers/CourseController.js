app.controller('CourseController',['$scope', 'CourseService', function ($scope, CourseService){
    $scope.loadCourses=function (){
        CourseService.getCourses().then(function(response) {
            $scope.courses = response.data;

        });
    };
    $scope.addCourse = function (){
        const course = {title: $scope.title, description: $scope.description};
        CourseService.addCourse(course).then(function(response){
            $scope.courses.push(response.data);
        });
    };
    $scope.loadCourses();

}]);