// src/CohortDetails.test.js
import React from 'react';
import { render, screen } from '@testing-library/react';
import CohortDetails from './CohortDetails';

const sampleCohort = {
  code: 'CT101',
  name: 'React Cohort',
  status: 'Ongoing'
};

describe('CohortDetails Component', () => {
  test('renders cohort details correctly', () => {
    render(<CohortDetails cohort={sampleCohort} />);

    expect(screen.getByText('CT101')).toBeInTheDocument();
    expect(screen.getByText('React Cohort')).toBeInTheDocument();
    expect(screen.getByText(/Ongoing/)).toBeInTheDocument();
  });

  test('has data-testid attribute on wrapper', () => {
    const { getByTestId } = render(<CohortDetails cohort={sampleCohort} />);
    expect(getByTestId('cohort-details')).toBeInTheDocument();
  });
});
