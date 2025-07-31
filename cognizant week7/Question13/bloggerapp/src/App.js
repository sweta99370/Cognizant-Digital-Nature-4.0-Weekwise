import { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';
function App() {
  const [view, setView] = useState('book');
  const renderComponent = () => {
    switch (view) {
      case 'book':
        return <BookDetails />;
      case 'blog':
        return <BlogDetails />;
      case 'course':
        return <CourseDetails />;
      default:
        return <h2>Invalid View</h2>;
    }
  };
  return (
    <div className="App">
      <h1>📘 BloggerApp Dashboard</h1>
      <button onClick={() => setView('book')}>Book</button>
      <button onClick={() => setView('blog')}>Blog</button>
      <button onClick={() => setView('course')}>Course</button>
      {/* Conditional Rendering */}
      <hr />
      {renderComponent()}
      {/* Inline conditional rendering with && */}
      <div>
        {view === 'book' && <p>Currently viewing books</p>}
        {view === 'blog' && <p>Currently viewing blogs</p>}
        {view === 'course' && <p>Currently viewing courses</p>}
      </div>
    </div>
  );
}

export default App;
